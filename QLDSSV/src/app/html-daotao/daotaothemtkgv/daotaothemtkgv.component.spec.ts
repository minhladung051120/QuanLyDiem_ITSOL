import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DaotaothemtkgvComponent } from './daotaothemtkgv.component';

describe('DaotaothemtkgvComponent', () => {
  let component: DaotaothemtkgvComponent;
  let fixture: ComponentFixture<DaotaothemtkgvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DaotaothemtkgvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DaotaothemtkgvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
