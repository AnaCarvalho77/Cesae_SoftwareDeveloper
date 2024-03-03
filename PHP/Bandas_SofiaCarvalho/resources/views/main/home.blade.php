@extends('layouts.femaster')


@section('content')
    <br><br><br>
    <h1>Bandas Sofia Carvalho</h1>

    @auth
        <h3> Olá, {{ Auth::user()->name }}</h3>
    @endauth
    <br>

    <div class="container">
        <div class="row row-cols-2">
            <div class="col">
                <div class="card mb-3" style="background-color: #399174">
                    <div class="card-body text-center">
                        <a href="{{ route('users.all') }}"
                            style="text-decoration: none; color: black;"><strong>Utilizadores</strong></a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card mb-3" style="background-color:  #399174">
                    <div class="card-body text-center">
                        <a href="{{ route('bandas.all') }}"
                            style="text-decoration: none; color: black;"><strong>Bandas</strong></a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card mb-3" style="background-color:  #399174">
                    <div class="card-body text-center">
                        <a href="{{ route('albuns.all') }}"
                            style="text-decoration: none; color: black;"><strong>Albuns</strong></a>
                    </div>
                </div>
            </div>
            @auth
                @if (Auth::user()->user_type == 1)
                    <div class="col">
                        <div class="card mb-3" style="background-color:  #399174">
                            <div class="card-body text-center">
                                <a href="{{ route('dashboard.home') }}"
                                    style="text-decoration: none; color: black;"><strong>Dashboard</strong></a>
                            </div>
                        </div>
                    </div>
                @endif
            @endauth
        </div>
    </div>
@endsection
