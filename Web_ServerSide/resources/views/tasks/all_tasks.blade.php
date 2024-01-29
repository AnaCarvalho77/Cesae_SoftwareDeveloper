@extends('layouts.femaster')

@section('content')
    <h3>Olá, sou todas as tarefas</h3>
    <br>
    <br>



    <table class="table">
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Tarefa</th>
            <th scope="col">Descrição Tarefa</th>
            <th scope="col">Data</th>
            <th scope="col">Estado</th>
            <th scope="col">Pessoa Responsável</th>
          </tr>
        </thead>
        <tbody>
            @foreach ($tasks as $item)
          <tr>
            <th scope='row'>{{ $item->id }}</th>
            <td>{{ $item->name }}</td>
            <td>{{ $item->description }}</td>
            <td>{{ $item->due_at }}</td>
            <td>{{ $item->status}}</td>
            <td>{{ $item->usname }}</td>

          </tr>
          @endforeach
        </tbody>
      </table>

@endsection
