<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous" defer>
    </script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css">
    <title>Document</title>
</head>

<body>

    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">SofiaCarvalho</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="{{ route('home.index') }}">Home</a>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link " href="#" role="button" data-bs-toggle="dropdown"
                            aria-expanded="false">
                            Bandas
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="{{ route('bandas.all') }}">Lista de Bandas</a></li>
                            @auth
                                @if (Auth::user()->user_type == 1)
                                    <li><a class="dropdown-item" href="{{ route('bandas.add') }}">Adicionar Bandas</a></li>
                                @endif
                            @endauth
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link " href="#" role="button" data-bs-toggle="dropdown"
                            aria-expanded="false">
                            Albuns
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="{{ route('albuns.all') }}">Lista de Albuns</a></li>
                            @auth
                                @if (Auth::user()->user_type == 1)
                                    <li><a class="dropdown-item" href="{{ route('albuns.add') }}">Adicionar Albuns</a></li>
                                @endif
                            @endauth
                        </ul>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link " href="#" role="button" data-bs-toggle="dropdown"
                            aria-expanded="false">
                            Utilizadores
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="{{ route('users.all') }}">Lista de Utilizadores</a></li>
                            @auth
                                @if (Auth::user()->user_type == 1)
                                    <li><a class="dropdown-item" href="{{ route('users.add') }}">Adicionar Utilizadores</a>
                                    </li>
                                @endif
                            @endauth
                        </ul>
                    </li>
                    @auth
                        @if (Auth::user()->user_type == 1)
                            <div class="col">
                                <li class="nav-item">
                                    <a class="nav-link" href="{{ route('dashboard.home') }}">Dashboard</a>
                                </li>
                        @endif
                    @endauth
                </ul>
                @if (Route::has('login'))
                    <div class="sm:fixed sm:top-0 sm:right-0 p-6 text-right z-10">
                        @auth

                            <form action="{{ route('logout') }}" method="POST">
                                @csrf
                                <button type="submit" class="btn btn-secondary">Logout</button>
                            </form>
                        @else
                            <a href="{{ route('login') }}"
                                class="btn btn-outline-secondary font-semibold text-gray-600 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white focus:outline focus:outline-2 focus:rounded-sm focus:outline-red-500">Log
                                in</a>

                            @if (Route::has('users.add'))
                                <a href="{{ route('users.add') }}"
                                    class="btn btn-outline-secondary ml-4 font-semibold text-gray-600 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white focus:outline focus:outline-2 focus:rounded-sm focus:outline-red-500">Register</a>
                            @endif

                        @endauth
                    </div>
                @endif
            </div>
        </div>
    </nav>
    <div class="container">



        @yield('content')


        <div class="float-sm-right">
            @yield('content2')
        </div>

        <br><br><br>



        <footer class="fixed-bottom my-3">
            ®Bandas
        </footer>
    </div>
</body>

</html>
