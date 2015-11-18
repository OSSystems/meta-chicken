SECTION = "devel/chicken"
DESCRIPTION = "Design by contract"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://contracts.meta;md5=cecc0a55b1c735ef6b69105f38305e9d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/contracts/contracts-${PV}.tar.gz"

SRC_URI[md5sum] = "a38ce9a68d1bb1573b8a716ec61d2cc0"
SRC_URI[sha256sum] = "cdf41cf857caca80559482f2d0e4febcfe1c2b01a16e1e7b0cc13d938d0ab4b3"

S = "${WORKDIR}/contracts-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
