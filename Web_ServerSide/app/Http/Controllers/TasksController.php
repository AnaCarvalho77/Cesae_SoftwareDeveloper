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
        ->join('users','tasks.user_id', '=', 'users.id')
        ->select('tasks.*','users.name as usname')
        ->first();

        return view('tasks.tasksView', compact ('myTask'));
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
     ]);

     Task::insert([
         'name'=> $request->name,
         'description'=> $request->description,
         'user_id'=> $request->user_id
     ]);
     return redirect()->route('tasks.all')->with('message', 'Boa, tarefa adicionada com sucesso!');

 }

 public function updateTask(Request $request){
     $request->validate([
         'phone' => 'min:9|max:14',
     ]);

     Task::where('id', $request->id)
     ->update([
         'name'=> $request->name,
         'description'=>$request->description,

     ]);
     return redirect()->route('tasks.all')->with('message', ' tarefa atualizada!');

 }





}
