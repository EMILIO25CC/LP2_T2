<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Sistema de Venta de Farmacia</title>
    <style>
        body {
            font-family: Arial, sans-serif;
		    display: flex;
		    justify-content: center;
		    align-items: center;
		    height: 100vh;
		    margin: 0;
		    background: linear-gradient(to right, #00c6ff, #0072ff); /* Degradado de azul claro a azul oscuro */
            
            
        }
        .container {
            text-align: center;
		    background-color: white;
		    padding: 40px;
		    border-radius : 8px;
		    box-shadow: 0 4px 15px rgba(0, 0, 0, 1.9); /* Sombra detrás de la tabla */
        }
        h1, h2 {
            margin: 10px 0;
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Proyecto Maven con JPA</h1>
        <h2>Sistema Farmacia</h2>
        
        <form action="controladorUsuario" method="POST">
            <input type="text" placeholder="Usuario" ><br>
            <input type="password" placeholder="Password" ><br>
            <button type="submit">Login</button>
        </form>
        
    </div>
</body>
</html>

