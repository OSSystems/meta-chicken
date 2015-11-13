SECTION = "devel/chicken"
DESCRIPTION = "Tiny PROLOG interpreter."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://tiny-prolog.meta;md5=2d7661a044863155745b1f9f623e2595"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/tiny-prolog/tiny-prolog-${PV}.tar.gz"

SRC_URI[md5sum] = "e13dc3afd6260367a1fbe65b0386e6bd"
SRC_URI[sha256sum] = "07e62f5c4507d2e21b6d41a3b91c20fdaa04ef30c1b341da3089e2455593efac"

S = "${WORKDIR}/tiny-prolog-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
