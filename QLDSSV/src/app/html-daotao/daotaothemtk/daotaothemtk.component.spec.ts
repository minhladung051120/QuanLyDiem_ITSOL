import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DaotaothemtkComponent } from './daotaothemtk.component';

describe('DaotaothemtkComponent', () => {
  let component: DaotaothemtkComponent;
  let fixture: ComponentFixture<DaotaothemtkComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DaotaothemtkComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DaotaothemtkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
