import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DaotaoQlkyhocComponent } from './daotao-qlkyhoc.component';

describe('DaotaoQlkyhocComponent', () => {
  let component: DaotaoQlkyhocComponent;
  let fixture: ComponentFixture<DaotaoQlkyhocComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DaotaoQlkyhocComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DaotaoQlkyhocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
