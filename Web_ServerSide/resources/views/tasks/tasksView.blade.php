@extends('layouts.femaster')

@section('content')
  {{--   <h1>Cucu, ver uma Task</h1>
    <br>
    <h4>Nome: {{$myTask->name}}</h4>
    <h4>Descrição: {{$myTask->description}}</h4>
    <h4>Estado: {{$myTask->status}}</h4>
    <h4>Pessoa Responsável: {{$myTask->usname}}</h4> --}}

    <form method="POST" action="{{route('tasks.update')}}">
        @csrf {{-- Token para impedir o sql injection, não é necessário usar --}}
       <input type="hidden" name="id" value="{{$myTask->id}}" id="">
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>
            <input type="texto" value="{{$myTask->name}}" name="name" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>
            @error('name')
            <div class='alert alert-danger'>
                Tarefa inválida
            </div>
            @enderror
          </div>
          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Descrição</label>
            <input type="texto"  value="{{$myTask->description}}" name = "description" class="form-control" id="exampleFormControlInput1">
          </div>
          <button type="submit" class="btn btn-primary">Atualizar</button>
    </form>
    <br>
    <a class= "btn btn-success" href="{{route('tasks.all')}}">Voltar</a>
    <br>

@endsection
