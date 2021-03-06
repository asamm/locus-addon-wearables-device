# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [1.1.7] - 2018-10-12
### Fixed
- navigation drawer activation area for enlarged for older SDKs
- added wake lock in track recording service
- fixed some issues during track recording service starting (multiple alterating start/stop calls, possible NPE)

## [1.1.6] - 2018-09-07
### Added
- possibility to switch screens by 2nd user HW button long press

### Fixed
- Various small bug fixes and improvements done on version 1.1.2 (through 1.1.5), mainly HRM debugging and fixing. The core functionality is the same as in 1.1.2.

## [1.1.2] (BETA) - 2018-08-17
### Added
- Activity for naming new waypoint using speech/keyboard
- New type of track rec values/statistic
- Configurable track rec dashboard
- Support for HR measurement and synchronization

## [1.1.1] - 2018-03-22
### Fixed
- crashes on Android Wear 1.x due to NPE when checking getIntent().getCategories() after app startup.

## [1.1.0] - 2018-03-21
### Added
- map panning by swiping/scrolling gestures on the map screen 
- map auto-rotate function 
- map auto-center function 
- support for watch hardware buttons - rotary input button and push-buttons
- support for communication via Message API (not currently used, but seems fully functional when enabled)

## [1.0.0] - 2017-12-22
### Fixed
- App returns to the last opened activity (for ambient-enabled screens) after wake up from the sleep mode. Originally returned to watch face.

### Added
- Last translations

## [0.1.4] - 2017-12-19
### Added
#### Wear
- Track recording activity with basic statistics. Ambient enabled.
- Map activity with navigation panel and zoom buttons. Ambient enabled.
- Profile selection activity for track recording. Ambient not supported.
- Fail activity which is shown after global application fail. Mainly on handshaking(version, periodic updates) or general communication problems.
- Navigation drawer pull-down "main" menu.
### Device
- Device application. Almost stateless, just reacting to communication and/or Locus periodic updates using receivers. 
  Couple of timers to send periodic data and to detect long inactivity to release app resources.
### Common
  - Common module for shared code between device and the wear modules.
