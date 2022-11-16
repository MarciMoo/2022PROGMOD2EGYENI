<html>
    <head>
    <meta charset="UTF-8">
	<title>kóórház</title>
	<link rel="stylesheet" href="res/style.css">
    </head>
    <body>
    <header>
        <div class="inside">

            <a href="index.php" class="logo">
                <img src="res/logo.png" alt="">
            </a>

            <div class="info">
                <p>Ez egy nem túl hosszú rövid szöveg, ami azért van itt, mert különben nem lenne</p>
            </div>

        </div>
    </header>
    <nav>
        <ul>
            <li><a href="index.php">Listázás</a></li>
            <li><a href="search.php">Keresés</a></li>
            <li><a href="add.php">Felvétel</a></li>
            <li><a href="edit.php">Módosítás</a></li>
            <li><a href="del.php">Leadás</a></li>
        </ul>
    </nav>
    <div class="container inside">
        <main>

            <h1>Betegek Listája</h1>
            <table>
            <?php

                //foreach("amennyi object van"){
                    echo '<tr>
                    <td>azonosito</td>
                    <td>név</td>
                    <td>születésidátum</td>
                    <td>kezeléskezdet</td>
                    <td>betegségneve</td>
                    </tr>'
               // }
            ?>
            
        </table>

        </main>
        <aside>

            <section>
                <h3>Doboz címe</h3>
                <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Rerum facilis nulla eum? Soluta, eaque quaerat.</p>
            </section>

            <section>
                <h3>Doboz címe</h3>
                <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Rerum facilis nulla eum? Soluta, eaque quaerat.</p>
            </section>

        </aside>
    </div>
	
    <footer>
        <div class="inside">

            <div class="contact">
                <h4>kórház</h4>
                <p>1234 Település, Utca neve 1/A.<br>
                    +36 30 112 112<br>
                    info@korhaz.hu</p>
            </div>
            <img class="logo" src="res/logo.png" alt="">

        </div>
    </footer>

</body>
</html>
