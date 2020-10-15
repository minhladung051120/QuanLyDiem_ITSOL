import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DaotaoQLTKComponent } from './daotao-qltk.component';

describe('DaotaoQLTKComponent', () => {
  let component: DaotaoQLTKComponent;
  let fixture: ComponentFixture<DaotaoQLTKComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DaotaoQLTKComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DaotaoQLTKComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
