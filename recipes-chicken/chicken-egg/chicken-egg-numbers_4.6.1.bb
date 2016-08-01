SECTION = "devel/chicken"
DESCRIPTION = "Full numeric tower support"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://numbers.meta;md5=69d1df76a955d24a5eca39aa3cfa723d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/numbers/numbers-${PV}.tar.gz"

SRC_URI[md5sum] = "f09ced4f48a8f0194977229575891d18"
SRC_URI[sha256sum] = "6faa7bfed8e986935d33fbc5db4669199ff7d73bda915e0a06d9b3fb56bc7159"

S = "${WORKDIR}/numbers-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
