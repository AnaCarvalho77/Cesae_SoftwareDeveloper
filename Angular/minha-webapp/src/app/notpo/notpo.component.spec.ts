import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NotpoComponent } from './notpo.component';

describe('NotpoComponent', () => {
  let component: NotpoComponent;
  let fixture: ComponentFixture<NotpoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NotpoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(NotpoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
