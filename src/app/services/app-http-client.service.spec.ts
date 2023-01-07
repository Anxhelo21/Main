import { TestBed } from '@angular/core/testing';

import { AppHttpClientService } from './app-http-client.service';

describe('AppHttpClientService', () => {
  let service: AppHttpClientService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AppHttpClientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
