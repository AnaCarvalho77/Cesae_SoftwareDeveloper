<?php

namespace App\Http\Controllers;

// use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TasksController extends Controller
{

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





}
