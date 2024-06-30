<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Project Checklist</title>
</head>
<body>
    <h1>Project Checklist</h1>

    <h2>First Class: Position</h2>
    <ul>
        <li>Class Position [public]</li>
        <li>OOP Topics:
            <ul>
                <li>Encapsulation</li>
                <li>Constructors</li>
                <li>ToString (Object / overriding)</li>
            </ul>
        </li>
    </ul>

    <h2>Starting to implement Board and Piece</h2>
    <ul>
        <li>Classes Piece, Board [public]</li>
        <li>OOP Topics:
            <ul>
                <li>Associations</li>
                <li>Encapsulation / Access Modifiers</li>
            </ul>
        </li>
        <li>Data Structures Topics:
            <ul>
                <li>Matrix</li>
            </ul>
        </li>
    </ul>

    <h2>Chess layer and printing the board</h2>
    <pre>
8 - - - - - - - - 
7 - - - - - - - - 
6 - - - - - - - - 
5 - - - - - - - - 
4 - - - - - - - - 
3 - - - - - - - - 
2 - - - - - - - - 
1 - - - - - - - - 
a b c d e f g h
    </pre>
    <ul>
        <li>Methods: Board.Piece(row, column) and Board.Piece(position)</li>
        <li>Enum Chess.Color</li>
        <li>Class Chess.ChessPiece [public]</li>
        <li>Class Chess.ChessMatch [public]</li>
        <li>Class ChessConsole.UI</li>
        <li>OOP Topics:
            <ul>
                <li>Enumerations</li>
                <li>Encapsulation / Access Modifiers</li>
                <li>Inheritance</li>
                <li>Downcasting</li>
                <li>Static members</li>
                <li>Layers pattern</li>
            </ul>
        </li>
        <li>Data Structures Topics:
            <ul>
                <li>Matrix</li>
            </ul>
        </li>
    </ul>

    <h2>Placing pieces on the board</h2>
    <ul>
        <li>Method: Board.PlacePiece(piece, position)</li>
        <li>Classes: Rook, King [public]</li>
        <li>Method: ChessMatch.InitialSetup</li>
        <li>OOP Topics:
            <ul>
                <li>Inheritance</li>
                <li>Overriding</li>
                <li>Polymorphism (ToString)</li>
            </ul>
        </li>
    </ul>

    <h2>BoardException and defensive programming</h2>
    <ul>
        <li>Class BoardException [public]</li>
        <li>Methods: Board.PositionExists, Board.ThereIsAPiece</li>
        <li>Implement defensive programming in Board methods</li>
        <li>OOP Topics:
            <ul>
                <li>Exceptions</li>
                <li>Constructors (a string must be informed to the exception)</li>
            </ul>
        </li>
    </ul>

    <h2>ChessException and ChessPosition</h2>
    <ul>
        <li>Class ChessException [public]</li>
        <li>Class ChessPosition [public]</li>
        <li>Refactor ChessMatch.InitialSetup</li>
        <li>OOP Topics:
            <ul>
                <li>Exceptions</li>
                <li>Encapsulation</li>
                <li>Constructors (a string must be informed to the exception)</li>
                <li>Overriding</li>
                <li>Static members</li>
                <li>Layers pattern</li>
            </ul>
        </li>
    </ul>

    <h2>Little improvement in board printing</h2>
    <ul>
        <li>Place more pieces on the board</li>
        <li>Distinguish piece colors in UI.PrintPiece method</li>
    </ul>

    <h2>Moving pieces</h2>
    <ul>
        <li>Method Board.RemovePiece</li>
        <li>Method UI.ReadChessPosition</li>
        <li>Method ChessMatch.PerformChessMove
            <ul>
                <li>Method ChessMatch.MakeMove</li>
                <li>Method ChessMatch.ValidadeSourcePosition</li>
            </ul>
        </li>
        <li>Write basic logic on Program.cs</li>
        <li>OOP Topics:
            <ul>
                <li>Exceptions</li>
                <li>Encapsulation</li>
            </ul>
        </li>
    </ul>
</body>
</html>

