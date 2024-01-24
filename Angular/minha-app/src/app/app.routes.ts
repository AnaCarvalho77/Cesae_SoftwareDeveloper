import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';
import { MeuComponenteComponent } from './meu-componente/meu-componente.component';
import { SegundaAaaPaginaComponent } from './segunda-aaa-pagina/segunda-aaa-pagina.component';
import { SegundaBbbPaginaComponent } from './segunda-bbb-pagina/segunda-bbb-pagina.component';

export const routes: Routes = [
  {path:"home", component:MeuComponenteComponent},
  {path:"primeira", title:"Primeira Página",component:PrimeiraPaginaComponent},
  {path:"segunda", title:"Segunda Página",component:SegundaPaginaComponent, children:[
    {path:"aaa",title:"Segunda Página Aaa",component:SegundaAaaPaginaComponent},
    {path:"bbb",title:"Segunda Página Bbb",component:SegundaBbbPaginaComponent}
  ]}
];
