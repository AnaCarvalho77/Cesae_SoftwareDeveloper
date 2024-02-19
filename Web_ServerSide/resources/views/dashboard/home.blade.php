@extends('layouts.femaster')


@section('content')
    <h1>Olá,
        @auth
            {{ Auth::user()->name }}
        @endauth estás no BackOffice
    </h1>

    <br><br>
        @auth
            @if ($message)
                <div class="alert alert-primary" role="alert">
                    Conta de Administrador
                </div>
            @endif
        @endauth

@endsection
