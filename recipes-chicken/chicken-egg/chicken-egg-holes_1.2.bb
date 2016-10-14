SECTION = "devel/chicken"
DESCRIPTION = "partial expressions as procedures with named parameters"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://holes.meta;md5=f4548dfd255a14c1338082d8e7e0d63e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/holes/holes-${PV}.tar.gz"

SRC_URI[md5sum] = "28f534e77f60bef1f0b114b6cd5912d8"
SRC_URI[sha256sum] = "00118309ba6829ac908cc0bef8b98be1c84d3094edd88348a384fa8c955bf956"

S = "${WORKDIR}/holes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
