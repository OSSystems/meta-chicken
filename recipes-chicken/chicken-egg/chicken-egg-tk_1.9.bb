SECTION = "devel/chicken"
DESCRIPTION = "An interface to the Tk GUI toolkit"
LICENSE = "Bremer"
LIC_FILES_CHKSUM = "file://tk.meta;md5=888e32531b9dcf202e9022c465b733c1"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/tk/tk-${PV}.tar.gz"

SRC_URI[md5sum] = "1f710500673d5e7edf633f8d88499872"
SRC_URI[sha256sum] = "76400e1cd0cd75d90eab1c5f4fb02b8b2917797a7066979e37e40ddbad8f80bf"

S = "${WORKDIR}/tk-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
