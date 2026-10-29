
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Connexion - MVCFramework10</title>
</head>
<body>
    <h1>Connexion</h1>

    <form action="login" method="post">
        <div>
            <label for="login">Identifiant</label>
            <input id="login" name="login" type="text" required>
        </div>

        <div>
            <label for="password">Mot de passe</label>
            <input id="password" name="password" type="password" required>
        </div>

        <button type="submit">Se connecter</button>
    </form>

    <p>Compte ADMIN : admin / 1234</p>
    <p>Compte USER : user / 1234</p>
</body>
</html>

