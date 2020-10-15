import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DaotaoQlmhComponent } from './daotao-qlmh.component';

describe('DaotaoQlmhComponent', () => {
  let component: DaotaoQlmhComponent;
  let fixture: ComponentFixture<DaotaoQlmhComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DaotaoQlmhComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DaotaoQlmhComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
