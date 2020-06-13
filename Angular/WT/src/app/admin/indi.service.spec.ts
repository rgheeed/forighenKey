import { TestBed } from '@angular/core/testing';

import { IndiService } from './indi.service';

describe('IndiService', () => {
  let service: IndiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(IndiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
