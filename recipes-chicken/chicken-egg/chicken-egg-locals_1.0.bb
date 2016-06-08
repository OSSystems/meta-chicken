SECTION = "devel/chicken"
DESCRIPTION = "local declarations a la ML"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://locals.meta;md5=1355413f83613ef9ad53d88ce57ae095"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/locals/locals-${PV}.tar.gz"

SRC_URI[md5sum] = "3b58c8e748d271cc5c79f7248f8d71fd"
SRC_URI[sha256sum] = "152fac06456264aad4cc55fa672c021eeaa4b0964a6a399708178d1802bfa3b7"

S = "${WORKDIR}/locals-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
