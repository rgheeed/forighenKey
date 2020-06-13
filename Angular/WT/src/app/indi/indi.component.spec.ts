import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IndiComponent } from './indi.component';

describe('IndiComponent', () => {
  let component: IndiComponent;
  let fixture: ComponentFixture<IndiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IndiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IndiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
