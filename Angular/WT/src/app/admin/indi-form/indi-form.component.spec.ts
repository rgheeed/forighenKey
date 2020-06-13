import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IndiFormComponent } from './indi-form.component';

describe('IndiFormComponent', () => {
  let component: IndiFormComponent;
  let fixture: ComponentFixture<IndiFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IndiFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IndiFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
