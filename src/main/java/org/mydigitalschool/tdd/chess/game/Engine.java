package org.mydigitalschool.tdd.chess.game;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.mydigitalschool.tdd.chess.game.pieces.King;
import org.mydigitalschool.tdd.chess.game.pieces.Piece;

public class Engine {
	
	private LocalDateTime startTime;
	
	private Player player1;
	private Player player2;
	
	private Board board;
	
	public Engine() {
		// Set starting time
		this.startTime = LocalDateTime.now();
		
		// Initialize the players with their color
		Color firstPlayerColor = Color.getRandomColor();
		this.player1 = new Player(firstPlayerColor);
		this.player2 = new Player(Color.getOtherColor(firstPlayerColor));
		
		this.board = new Board();
		board.initPieces(this.player1, this.player2);

		// Render the board on creation
		System.out.println(board.toString());
	}
	
	public void play() {
		Scanner in = new Scanner(System.in);
		boolean won = false;
		Player currentPlayer = this.player1.getColor() == Color.WHITE ? this.player1 : this.player2;
		
		while (won == false) {
			String currentColor = currentPlayer.getColor() == Color.WHITE ? "blancs" : "noirs";
			System.out.println("Au tour des " + currentColor);
			
			Piece selectedPiece = null;
			
			while (selectedPiece == null) {
				System.out.println("Indiquer la ligne de la pièce à déplacer");
				int y = in.nextInt();
				System.out.println("Indiquer la colonne de la pièce à déplacer");
				int x = in.nextInt();
				
				try {
					selectedPiece = this.board.getPiece(y, x);
					if (selectedPiece == null) {
						System.out.println("Il n'y a pas de pièce à cet emplacement");
					}
					
					if (selectedPiece.getPlayer() != currentPlayer) {
						System.out.println("Cette pièce n'est pas à vous");
						selectedPiece = null;
					}
				} catch (OutOfBoardException e) {
					System.out.println(e);
				}
			}
			
			boolean moved = false;
			while (moved == false) {
				System.out.println("Indiquer la ligne de la case sur laquelle déplacer la pièce");
				int y = in.nextInt();
				System.out.println("Indiquer la colonne de la case sur laquelle déplacer la pièce");
				int x = in.nextInt();
				
				if (selectedPiece.isMovementPossible(y, x)){
					int oldY = selectedPiece.getyIdx();
					int oldX = selectedPiece.getxIdx();
					try {
						if (this.board.getPiece(y, x).getClass() == King.class) {
							won = true;
							System.out.println("Le joueur des " + currentColor + " a gagné !!!");
						}
						this.board.setPiece(y, x, selectedPiece);
						this.board.removePiece(oldY, oldX);
					} catch (OutOfBoardException e) {
						System.out.println(e);
					}
				} else {
					System.out.println("Mouvement impossible pour ce type de pièce");
				}
			}
			System.out.println(board.toString());
		}
		in.close();

	}
	
	public LocalDateTime getStartTime() {
		return this.startTime;
	}
	
	public void setLocalDateTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
	
}
