<html lang="pt-BR">

<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Sistemas Web Java IFSP</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" crossorigin="anonymous">

</head>

<body>

    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="#">IFSP - Sistemas WEB Java</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault"
            aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarsExampleDefault">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Link</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">Disabled</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true"
                        aria-expanded="false">Dropdown</a>
                    <div class="dropdown-menu" aria-labelledby="dropdown01">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>

    <main role="main">

        <!-- Main jumbotron for a primary marketing message or call to action -->
        <div class="jumbotron">
            <div class="container">
                <h1 class="display-3">Seja bem vindo!</h1>
                <p>Estamos aprendendo Java Web usando servelet
                </p>
                <p>
                    <!-- <a class="btn btn-primary btn-lg" href="#" role="button">Próximos passos...</a> -->
                </p>
            </div>
        </div>

        <div class="container">
            <!-- Example row of columns -->
            <div class="row">
                <div class="col-md-6">
                    <form id="frmCalcular">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="">Digite os valores a serem calculados:</span>
                            </div>
                            <input type="text" class="form-control" name="val1" id="val1">
                            <input type="text" class="form-control" name="val2" id="val2">
                        </div>
                        <br />
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="">Selecione a operacao:</span>
                            </div>
                            <select id="operacao">
                                <option value="+">+</option>
                                <option value="-">-</option>
                                <option value="/">/</option>
                                <option value="*">*</option>
                            </select>
                        </div>
                        <br />
                        <button type="submit" class="btn btn-secondary btn-block" id="calcular">Calcular</button>
                    </form>
                </div>
                <div class="col-md-3">
                    <h2>Resultado da operacao</h2>
                    <p id="resultado" class="text-center" style="font-size: 20px;"></p>
                </div>
                <div class="col-md-3">
                    <h2>Feito por:</h2>
                    <ul>
                        <li>Daniel</li>
                        <li>Alvaro</li>
                    </ul>

                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <p>

                    </p>
                </div>
            </div>

            <hr>

        </div>
        <!-- /container -->

    </main>

    <footer class="container">
        <p>Instituto Federal de Sao Paulo - Campus Cubatao</p>
    </footer>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="home.js" charset="utf-8"></script>
</body>

</html>