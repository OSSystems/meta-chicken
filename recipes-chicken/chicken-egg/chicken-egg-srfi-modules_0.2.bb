SECTION = "devel/chicken"
DESCRIPTION = "Provides modules for SRFIs usually exported by the chicken' module"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-modules.meta;md5=dd1a47370ea71833d12944a653b63b40"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-modules/srfi-modules-${PV}.tar.gz"

SRC_URI[md5sum] = "91cbab4007b14a50a0cbc4c4dc02f0c8"
SRC_URI[sha256sum] = "82aa286f3b8e07f8b2ea00b7fb6b1d058872d42e83b44138a33cfe78afbcf100"

S = "${WORKDIR}/srfi-modules-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
