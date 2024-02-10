<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class DashboardController extends Controller
{
    public function admin()
    {

        $isAdmin = auth()->user()->user_type == 1;
        return view('backoffice.dashboard', compact ('isAdmin'));
    }

}
