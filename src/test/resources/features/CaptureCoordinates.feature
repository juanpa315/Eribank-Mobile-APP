Feature: AS QA of the time zone mobile app
  I want to test the operation of the logintude and lagitude data capture
  To guarantee the quality of the aplication
  @cordinates
  Scenario: Test that the capture of coordinates works when the access to the cell location has been granted
    When Request the cordinates
    Then The system display latitude and longitude of the current location

