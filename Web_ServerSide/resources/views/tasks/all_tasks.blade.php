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
            <th></th>
            <th></th>
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
            <td><a href="{{route('tasks.view', $item->id)}}" class="btn btn-info">Ver/Atualizar</a></td>
            <td><a href="{{route('tasks.delete', $item->id)}}" class="btn btn-danger">Apagar</a></td>

          </tr>
          @endforeach
        </tbody>
      </table>

      <a href="{{route('tasks.add', $item->id)}}" class="btn btn-info">Inserir tarefa</a></td>

@endsection
