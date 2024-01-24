import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-segunda-aaa-pagina',
  standalone: true,
  imports: [RouterModule,RouterOutlet],
  templateUrl: './segunda-aaa-pagina.component.html',
  styleUrl: './segunda-aaa-pagina.component.scss'
})
export class SegundaAaaPaginaComponent {

}
