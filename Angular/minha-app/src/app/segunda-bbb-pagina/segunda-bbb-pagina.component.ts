import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-segunda-bbb-pagina',
  standalone: true,
  imports: [RouterModule,RouterOutlet, CommonModule],
  templateUrl: './segunda-bbb-pagina.component.html',
  styleUrl: './segunda-bbb-pagina.component.scss'
})
export class SegundaBbbPaginaComponent {
  arr:Array<string> = [
    'Joao',
    'Natana',
    'Átylla',
    'Joana',
    'Ricardo'
  ]


}
