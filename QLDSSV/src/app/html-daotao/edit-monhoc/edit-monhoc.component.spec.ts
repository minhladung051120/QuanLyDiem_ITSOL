import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditMonhocComponent } from './edit-monhoc.component';

describe('EditMonhocComponent', () => {
  let component: EditMonhocComponent;
  let fixture: ComponentFixture<EditMonhocComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditMonhocComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditMonhocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
