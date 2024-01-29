import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';
import { SegundaAaaPaginaComponent } from './segunda-aaa-pagina/segunda-aaa-pagina.component';
import { SegundaBbbPaginaComponent } from './segunda-bbb-pagina/segunda-bbb-pagina.component';
import { NotFoundComponent } from './not-found/not-found.component';

export const routes: Routes = [
  {path:"", redirectTo: "/primeira", pathMatch:"full"},
  {path:"primeira", title:"Primeira Página",component:PrimeiraPaginaComponent},
  {path:"segunda", title:"Segunda Página",component:SegundaPaginaComponent, children:[
    {path:"aaa",title:"Segunda Página Aaa",component:SegundaAaaPaginaComponent},
    {path:"bbb",title:"Segunda Página Bbb",component:SegundaBbbPaginaComponent},

  ]},
  // {path:"", title:"Primeira Página",component:PrimeiraPaginaComponent}
  {path:"**", title:"404 - Página não encontrada", component:NotFoundComponent}

];
