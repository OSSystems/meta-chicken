SECTION = "devel/chicken"
DESCRIPTION = "Continuations as a separate datatype"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://continuations.meta;md5=11a023ca713824783ee612ad86bd1a0d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/continuations/continuations-${PV}.tar.gz"

SRC_URI[md5sum] = "fa692961289e05ed5a91c7989ce67c93"
SRC_URI[sha256sum] = "297e5f56ab97d20cc1ac29e7aa56bcb6241f3fbcada477708adb39dc2afb4b64"

S = "${WORKDIR}/continuations-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
