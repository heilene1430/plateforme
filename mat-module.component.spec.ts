import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MatModuleComponent } from './mat-module.component';

describe('MatModuleComponent', () => {
  let component: MatModuleComponent;
  let fixture: ComponentFixture<MatModuleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MatModuleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MatModuleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
