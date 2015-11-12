SECTION = "devel/chicken"
DESCRIPTION = "Simple list-comprehensions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://list-of.meta;md5=39230c109a7796a4fc64d9f663ba421b"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/list-of/list-of-${PV}.tar.gz"

SRC_URI[md5sum] = "67c09216a00476c0de13dc9e97987733"
SRC_URI[sha256sum] = "51af2ef9970e3c8a24aefa35d1ac36abecbdfff3fe0988f5f6cdb9a6aa638528"

S = "${WORKDIR}/list-of-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
