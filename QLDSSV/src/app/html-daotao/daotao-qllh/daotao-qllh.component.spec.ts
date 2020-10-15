import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DaotaoQllhComponent } from './daotao-qllh.component';

describe('DaotaoQllhComponent', () => {
  let component: DaotaoQllhComponent;
  let fixture: ComponentFixture<DaotaoQllhComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DaotaoQllhComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DaotaoQllhComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
