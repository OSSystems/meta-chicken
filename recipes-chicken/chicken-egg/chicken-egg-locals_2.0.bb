SECTION = "devel/chicken"
DESCRIPTION = "local declarations a la ML"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://locals.meta;md5=1355413f83613ef9ad53d88ce57ae095"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/locals/locals-${PV}.tar.gz"

SRC_URI[md5sum] = "8632f48e5c8351d2d780e1f80398532e"
SRC_URI[sha256sum] = "23def22c5ff7b1975d6836ce6cc4e9df151c42d6e62a955f09f92f8431eaf522"

S = "${WORKDIR}/locals-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
