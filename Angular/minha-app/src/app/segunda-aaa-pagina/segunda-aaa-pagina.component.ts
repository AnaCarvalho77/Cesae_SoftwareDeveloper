import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-segunda-aaa-pagina',
  standalone: true,
  imports: [RouterModule, RouterOutlet, CommonModule],
  templateUrl: './segunda-aaa-pagina.component.html',
  styleUrl: './segunda-aaa-pagina.component.scss'
})
export class SegundaAaaPaginaComponent {
  valor: number = 0;

  fn(): void {
    if (this.valor > 0) {
      // ...
    } else if (this.valor == 0) {
      //...
    } else {
      // ...
    }

    if (this.valor > 0) {
      // ...
    } else{
      if (this.valor ==0) {
        // ...
      } else {
        // ...
      }
    }

  }
}
