SECTION = "devel/chicken"
DESCRIPTION = "enhanced scheduler"
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://high-load-scheduler.meta;md5=6fdf140e40a8d2219e1459955fb7c825"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/high-load-scheduler/high-load-scheduler-${PV}.tar.gz"

SRC_URI[md5sum] = "4303265408c8b236d630046c932ae67a"
SRC_URI[sha256sum] = "3d3220220a4dffc2f286bfe3f540b7fa9c535427103a01216d8a01eb3c30c0f6"

S = "${WORKDIR}/high-load-scheduler-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
