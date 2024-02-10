<?php

namespace App\Http\Controllers;

use App\Models\Task;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TasksController extends Controller
{

    public function addTasks()
    {

        $users = DB::table('users')->get();

        return view('tasks.insert_tasks',compact ('users'));
    }

    public function allTasks()
    {
        $tasks = $this->getTasks();

        return view('tasks.all_tasks', compact('tasks'));
    }

    private function getTasks(){

        $tasks = DB::table('tasks')
        ->join('users','tasks.user_id', '=', 'users.id')
        ->select('tasks.*','users.name as usname')
        ->get();

        return $tasks;
    }



    public function viewTask($id){
        $myTask = DB::table('tasks')
        ->where('tasks.id', $id)
        ->leftjoin('users','tasks.user_id', '=', 'users.id')
        ->select('tasks.*','users.name as usname')
        ->first();

        $users = DB::table('users')->get();

        return view('tasks.tasksView', compact ('myTask','users'));
    }

    public function deleteTask($id){
        DB::table('tasks')
        ->where('id',$id)
        ->delete();

        return back();
    }

    public function createTask(Request $request){

     $request->validate([
         'name' => 'required|string|max:20',
         'description' => 'required|string|max:200',
         'user_id' => 'required|integer|exists:users,id'
     ]);

     Task::insert([
         'name'=> $request->name,
         'description'=> $request->description,
         'user_id'=> $request->user_id
     ]);
     return redirect()->route('tasks.all')->with('message', 'Tarefa adicionada com sucesso!');

 }

 public function updateTask(Request $request){
     $request->validate([
        'name' => 'required|string|max:20',
        'description' => 'required|string|max:200',
        'user_id' => 'required|integer|exists:users,id'
     ]);

     Task::where('id', $request->id)
     ->update([
         'name'=> $request->name,
         'description'=>$request->description,
         'user_id'=>$request->user_id,
         'due_at'=>$request->due_at

     ]);
     return redirect()->route('tasks.all')->with('message', ' Tarefa atualizada!');

 }





}
