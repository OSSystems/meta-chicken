SECTION = "devel/chicken"
DESCRIPTION = "Configurations made easy"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://simple-configuration.meta;md5=a1061b73d621b4d4cffc6b97ce10ac5b"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-configuration/simple-configuration-${PV}.tar.gz"

SRC_URI[md5sum] = "5021521831624806535c1c60be390179"
SRC_URI[sha256sum] = "e837ae27c187ba74655ebc54b424809a469612acf0b453a8d1f67cbe344d3f29"

S = "${WORKDIR}/simple-configuration-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
