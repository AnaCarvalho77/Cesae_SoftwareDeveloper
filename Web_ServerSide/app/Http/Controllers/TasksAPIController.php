<?php

namespace App\Http\Controllers;


use App\Http\Resources\TaskResourceCollection;
use Illuminate\Http\Request;
use App\Models\Task;
use App\Http\Resources\TaskResource;

class TasksAPIController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index():TaskResourceCollection
    {

        /* para mostrar todas as tarefas em vez de dar por id de task */
        return new TaskResourceCollection(resource: Task::paginate());
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $task = Task::create($request->all());
        return new TaskResource($task);
    }

    /**
     * Display the specified resource.
     */
    public function show(Task $task)
    {
       return new TaskResource($task);
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Task $task)
    {
        $task = $task->update($request->all());
        return $task;
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Task $task)
    {
        $task->delete();
        return response()->json('delete feito');

    }
}