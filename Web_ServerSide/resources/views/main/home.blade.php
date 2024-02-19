@extends('layouts.femaster')


@section('content')
    <h3>Hello World, estamos nas Views</h3>

@auth
<h3> Olá, {{ Auth::user()->name }}</h3>
@endauth


    <h5>Tens disponiveis estes links:</h5>

    <ul>
        <li><a href="{{ route('bemvindos') }}">Vai para casa!</a></li>
        <li><a href="{{ route('users.all') }}">Todos os utilizadores</a></li>
        <li><a href="{{ route('users.add') }}">Adionar utilizador</a></li>
        <li><a href="{{ route('tasks.all') }}">Todas as tarefas</a></li>
        <li><a href="{{ route('tasks.add') }}">Adicionar Tarefa</a></li>
        <li><a href="{{ route('dashboard.home') }}">Ir para o BackOffice</a></li>
    </ul>
    <h2>Dados Cesae</h2>

    <p>Nome: {{ $infoCesae['name']}}</p>
    <p>Morada: {{ $infoCesae['address']}}</p>
    <p>Email: {{ $infoCesae['email']}}</p>
@endsection

@section('content2')
<h2>outro conteudo</h2>
@endsection
