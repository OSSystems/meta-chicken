SECTION = "devel/chicken"
DESCRIPTION = "Some user-friendly exception routines"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://simple-exceptions.meta;md5=8d3b1359d670144387e31b70c11ac52e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-exceptions/simple-exceptions-${PV}.tar.gz"

SRC_URI[md5sum] = "db6baf477c429b7a4e96e2779ed3af2c"
SRC_URI[sha256sum] = "ba372df46acdee3608343b025ba9bad06b89e521ffb0faee3b168213be55e8a0"

S = "${WORKDIR}/simple-exceptions-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
