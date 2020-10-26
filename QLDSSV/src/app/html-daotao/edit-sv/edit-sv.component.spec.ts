import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditSVComponent } from './edit-sv.component';

describe('EditSVComponent', () => {
  let component: EditSVComponent;
  let fixture: ComponentFixture<EditSVComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditSVComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditSVComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
