SECTION = "devel/chicken"
DESCRIPTION = "QR Code encoding - Bindings to libqrencode"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://qrencode.meta;md5=b2172f16884683dd47090f8c0731850f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/qrencode/qrencode-${PV}.tar.gz"

SRC_URI[md5sum] = "78e82c6276e08f8fa888c61e2392acb7"
SRC_URI[sha256sum] = "a4deabe15a0e14bfc20af56403507acdb1871c9afa14ce96435da6e3dd9e67ee"

S = "${WORKDIR}/qrencode-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
