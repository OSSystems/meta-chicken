SECTION = "devel/chicken"
DESCRIPTION = "Foreign feature testing"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://feature-test.meta;md5=f06eb8d3bd4bfa7a33287a8d7060ceca"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/feature-test/feature-test-${PV}.tar.gz"

SRC_URI[md5sum] = "37363d2c2119001c1c680b734e2ec48e"
SRC_URI[sha256sum] = "f3d06ee9bd1b38442134ea3666494648cc0043dca920b973dea32fd69ec60a85"

S = "${WORKDIR}/feature-test-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
